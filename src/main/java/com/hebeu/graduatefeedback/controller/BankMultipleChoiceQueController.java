package com.hebeu.graduatefeedback.controller;

import com.github.pagehelper.PageInfo;
import com.hebeu.graduatefeedback.pojo.BankMultipleChoiceQue;
import com.hebeu.graduatefeedback.utils.ServerResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/*双选题
 * 4-24Vanilla
 * */
@RestController
@RequestMapping("/bankMultipleChoiceQue")
public class BankMultipleChoiceQueController {
    @Resource
    com.hebeu.graduatefeedback.service.BankMultipleChoiceQueService BankMultipleChoiceQueService;

    /*导入excel题目信息信息*/
    @RequestMapping(value = "/insertBankMultipleChoiceQueInfoList",method = RequestMethod.POST)
    public ServerResponse insertBankMultipleChoiceQueInfoList(@RequestBody Map<String, Object> obj){
        try{
            List<Map<String, Object>> bankMultipleChoiceQueList = (List<Map<String, Object>>) obj.get("bankMultipleChoiceQueList");
            Map<String, Object> result = BankMultipleChoiceQueService.insertBankMultipleChoiceQueInfoList(bankMultipleChoiceQueList);
            return ServerResponse.createBySuccess("文件上传成功",result);
        }catch(Exception e){
            return ServerResponse.createByError("上传失败!请按照模板上传！");
        }

    }

    @GetMapping("/list")
    public ServerResponse getBankMultipleChoiceQue(BankMultipleChoiceQue bankMultipleChoiceQue){
        List<BankMultipleChoiceQue> bankMultipleChoiceQues =BankMultipleChoiceQueService.getBankMultipleChoiceQues(bankMultipleChoiceQue);
        PageInfo<BankMultipleChoiceQue> pageInfo = new PageInfo<>(bankMultipleChoiceQues);
        return ServerResponse.createBySuccess("查询成功！",pageInfo);
    }
    @GetMapping("/getAll")
    public ServerResponse getAll(BankMultipleChoiceQue bankMultipleChoiceQue){
//        System.out.println("用户名"+bankMultipleChoiceQue.getName());
//        BankMultipleChoiceQue.setActive(1);
        return ServerResponse.createBySuccess("查询成功！",BankMultipleChoiceQueService.getAll(bankMultipleChoiceQue));
    }
    @PostMapping("/add")
    public ServerResponse add(BankMultipleChoiceQue bankMultipleChoiceQue){
        int result =BankMultipleChoiceQueService.add(bankMultipleChoiceQue);
//        if(result>0){
            return ServerResponse.createBySuccess("添加成功！",null);
//        }
//        else{
//            return ServerResponse.createByError("添加失败，该学号已存在！请重新输入...");
//        }

    }
    @GetMapping("/del")
    public ServerResponse del(BankMultipleChoiceQue bankMultipleChoiceQue){
        int result = BankMultipleChoiceQueService.update(bankMultipleChoiceQue);
        if(result>0){
            return ServerResponse.createBySuccess("删除成功！",null);
        }
        else
            return ServerResponse.createByError("删除失败！");
    }

    @PostMapping("/update")
    public ServerResponse update(BankMultipleChoiceQue bankMultipleChoiceQue){
        int result = BankMultipleChoiceQueService.update(bankMultipleChoiceQue);
        if(result>0){
            return ServerResponse.createBySuccess("更新成功！",null);
        }
        else
            return ServerResponse.createByError("更新失败！");
    }
    @GetMapping("/getOne")
    public ServerResponse getOne(Integer id){
        BankMultipleChoiceQue bankMultipleChoiceQue = BankMultipleChoiceQueService.getBankMultipleChoiceQueById(id);
        return ServerResponse.createBySuccess("获取成功！",bankMultipleChoiceQue);
    }




}
