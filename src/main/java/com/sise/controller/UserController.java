package com.sise.controller;


import com.github.pagehelper.PageInfo;
import com.sise.bean.User;
import com.sise.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/list")
    public String list(Model model,Integer pageNum){

        PageInfo<User> pageInfo = userService.findByPage(pageNum,5);
       model.addAttribute("users",pageInfo);
      //  model.addAttribute("users",userService.listAll());
        return "user/list";
    }


//删除
@RequestMapping("/delete")
public String delete(Long id){

    userService.delete(id);
    return "redirect:/user/list";
}



//编辑操作，加入input页面，并输入信息
@RequestMapping("/input")
public String input(Long id,Model model){

        if (id!=null){
            model.addAttribute("user",userService.get(id));
        }

    return "user/input";
}





    //编辑操作，进入input页面，并输入信息
    @RequestMapping("/saveOrUpdate")
    public String saveOrUpdate(User user, MultipartFile upload, HttpServletRequest request) throws Exception {
        //使用fileupload组件完成文件上传
        //指定文件上传的位置
        String path= request.getSession().getServletContext().getRealPath("/uploads");
        //判断该路径是否存在
        File file=new File(path);
        if (!file.exists()){
            file.mkdirs();
        }

        String filename=upload.getOriginalFilename();
        String uuid= UUID.randomUUID().toString().replace("-","");
        filename=uuid+"_"+filename;
        upload.transferTo(new File(path,filename));





        if (user.getId()==null){
            userService.save(user);
        }

        else {
            userService.update(user);
        }
        return "redirect:/user/list";
    }



    //登录操作，判断是否以注册
    @RequestMapping("/success")
    public String success(Long id,String name,Model model){

        List<User> list=userService.listAll();


       if (userService.get(id)!=null){
          for (User user:list){

              if (user.getName().equals(name)&&user.getId()==id){
                  model.addAttribute("user",userService.get(id));
                  System.out.println("登录成功");
                  return "user/success";
              }


          }

       }

       else {

           System.out.println("2id或账户名输入不正确");
           return "user/error";
       }

       return null;
    }






    //进入登录界面
    @RequestMapping("/login")
    public String login(){
        return "user/login";
    }


    //返回主界面
    @RequestMapping("/index")
    public String index(){

       return "redirect:/index.jsp";

    }





    @InitBinder
    public void initBinder(WebDataBinder binder){
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class,new CustomDateEditor(dateFormat,true));
    }


}
