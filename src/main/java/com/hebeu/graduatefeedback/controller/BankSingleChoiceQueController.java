package com.hebeu.graduatefeedback.controller;

import com.github.pagehelper.PageInfo;
import com.hebeu.graduatefeedback.pojo.BankSingleChoiceQue;
import com.hebeu.graduatefeedback.utils.ServerResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/*单选题
 * 4-14Vanilla
 * */
@RestController
@RequestMapping("/bankSingleChoiceQue")
public class BankSingleChoiceQueController {
    @Resource
    com.hebeu.graduatefeedback.service.BankSingleChoiceQueService BankSingleChoiceQueService;

    /*导入excel题目信息信息*/
    @RequestMapping(value = "/insertBankSingleChoiceQueInfoList",method = RequestMethod.POST)
    public ServerResponse insertBankSingleChoiceQueInfoList(@RequestBody Map<String, Object> obj){
//        System.out.println("学生导入");
        try{
            List<Map<String, Object>> bankSingleChoiceQueList = (List<Map<String, Object>>) obj.get("bankSingleChoiceQueList");
            Map<String, Object> result = BankSingleChoiceQueService.insertBankSingleChoiceQueInfoList(bankSingleChoiceQueList);
            return ServerResponse.createBySuccess("文件上传成功",result);
        }catch(Exception e){
            return ServerResponse.createByError("上传失败!请按照模板上传！");
        }

    }

    @GetMapping("/list")
    public ServerResponse getBankSingleChoiceQue(BankSingleChoiceQue bankSingleChoiceQue){
        List<BankSingleChoiceQue> bankSingleChoiceQues =BankSingleChoiceQueService.getBankSingleChoiceQues(bankSingleChoiceQue);
        PageInfo<BankSingleChoiceQue> pageInfo = new PageInfo<>(bankSingleChoiceQues);
        return ServerResponse.createBySuccess("查询成功！",pageInfo);
    }
    @GetMapping("/getAll")
    public ServerResponse getAll(BankSingleChoiceQue bankSingleChoiceQue){
//        System.out.println("用户名"+bankSingleChoiceQue.getName());
//        BankSingleChoiceQue.setActive(1);
        return ServerResponse.createBySuccess("查询成功！",BankSingleChoiceQueService.getAll(bankSingleChoiceQue));
    }
    @PostMapping("/add")
    public ServerResponse add(BankSingleChoiceQue bankSingleChoiceQue){
        int result =BankSingleChoiceQueService.add(bankSingleChoiceQue);
//        if(result>0){
            return ServerResponse.createBySuccess("添加成功！",null);
//        }
//        else{
//            return ServerResponse.createByError("添加失败，该学号已存在！请重新输入...");
//        }

    }
    @GetMapping("/del")
    public ServerResponse del(BankSingleChoiceQue bankSingleChoiceQue){
        int result = BankSingleChoiceQueService.update(bankSingleChoiceQue);
        if(result>0){
            return ServerResponse.createBySuccess("删除成功！",null);
        }
        else
            return ServerResponse.createByError("删除失败！");
    }

    @PostMapping("/update")
    public ServerResponse update(BankSingleChoiceQue bankSingleChoiceQue){
        int result = BankSingleChoiceQueService.update(bankSingleChoiceQue);
        if(result>0){
            return ServerResponse.createBySuccess("更新成功！",null);
        }
        else
            return ServerResponse.createByError("更新失败！");
    }
    @GetMapping("/getOne")
    public ServerResponse getOne(String id){
        BankSingleChoiceQue bankSingleChoiceQue = BankSingleChoiceQueService.getBankSingleChoiceQueById(id);
        return ServerResponse.createBySuccess("获取成功！",bankSingleChoiceQue);
    }




}
