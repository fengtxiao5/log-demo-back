package com.example.logdemo;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
class LogDemoApplicationTests {

    @Test
    void contextLoads() {
        String 开发单 = "产品名称\n" +
                "项目名称\n" +
                "任务编号\n" +
                "任务名称\n" +
                "客户名称\n" +
                "任务状态\n" +
                "任务描述\n" +
                "任务类型\n" +
                "所属应用\n" +
                "应用版本\n" +
                "任务来源\n" +
                "创建人\n" +
                "任务创建日期\n" +
                "测试分配人\n" +
                "测试类型\n" +
                "任务处理人\n" +
                "模块名称\n" +
                "修改版本\n" +
                "测试包版本号\n" +
                "集成日期\n" +
                "末次集成日期\n" +
                "补丁编号\n" +
                "修改说明\n" +
                "修改文件\n" +
                "需求编号\n" +
                "测试打回次数\n" +
                "测试不通过次数\n" +
                "测试执行人\n" +
                "测试结果\n" +
                "要求测试完成日期\n" +
                "实际测试完成日期\n" +
                "用例评审负责人\n" +
                "缺陷编号\n" +
                "是否缺陷转出";

        String 任务单 = "产品名称\n" +
                "项目名称\n" +
                "任务编号\n" +
                "需求编号\n" +
                "任务状态\n" +
                "任务处理人\n" +
                "任务名称\n" +
                "客户名称\n" +
                "模块名称\n" +
                "修改版本\n" +
                "补丁编号\n" +
                "迭代名称\n" +
                "任务类型\n" +
                "所属应用\n" +
                "应用版本\n" +
                "创建人\n" +
                "任务创建日期\n" +
                "测试类型\n" +
                "测试分配人\n" +
                "测试安排状态\n" +
                "测试执行人\n" +
                "用例编写人\n" +
                "用例完成状态\n" +
                "要求用例完成日期\n" +
                "实际用例完成日期\n" +
                "要求测试完成日期\n" +
                "实际测试完成日期\n" +
                "实际开发完成日期\n" +
                "用例是否评审\n" +
                "用例评审负责人\n" +
                "用例评审结论\n" +
                "用例评审标志\n" +
                "是否缺陷转出";

//        System.out.println(开发单);
//        System.out.println(任务单);

        String[] modifyArr = 开发单.split("\n");
        String[] taskArr = 任务单.split("\n");
//        System.out.println(Arrays.toString(modifyArr));
//        System.out.println(Arrays.toString(taskArr));

        List<String> modifyList = Arrays.asList(modifyArr);
        List<String> taskList = Arrays.asList(taskArr);
//        System.out.println(modifyList);
//        System.out.println(taskList);

        List<String> finalList = new ArrayList<>();
        taskList.forEach((x) -> {
            if(!modifyList.contains(x)){
                finalList.add(x);
            }
        });
        String allString = "产品名称\n" +
                "项目名称\n" +
                "任务编号\n" +
                "任务名称\n" +
                "客户名称\n" +
                "任务状态\n" +
                "任务描述\n" +
                "任务类型\n" +
                "所属应用\n" +
                "应用版本\n" +
                "任务来源\n" +
                "创建人\n" +
                "任务创建日期\n" +
                "测试分配人\n" +
                "测试安排状态\n" +
                "测试类型\n" +
                "任务处理人\n" +
                "模块名称\n" +
                "修改版本\n" +
                "测试包版本号\n" +
                "集成日期\n" +
                "末次集成日期\n" +
                "补丁编号\n" +
                "迭代名称\n" +
                "修改说明\n" +
                "修改文件\n" +
                "需求编号\n" +
                "测试打回次数\n" +
                "测试不通过次数\n" +
                "测试执行人\n" +
                "用例编写人\n" +
                "用例完成状态\n" +
                "要求用例完成日期\n" +
                "实际用例完成日期\n" +
                "实际开发完成日期\n" +
                "用例是否评审\n" +
                "用例评审结论\n" +
                "用例评审标志\n" +
                "测试结果\n" +
                "要求测试完成日期\n" +
                "实际测试完成日期\n" +
                "用例评审负责人\n" +
                "缺陷编号\n" +
                "是否缺陷转出";
        String[] allArr = allString.split("\n");
        List<String> allList = Arrays.asList(allArr);
        System.out.println(allList);
        System.out.println(allList.containsAll(modifyList));
        System.out.println(allList.containsAll(taskList));
    }

    @Test
    void 获取配置() {
        String 任务单配置 = "任务编号\n" +
                "任务名称\n" +
                "客户名称\n" +
                "任务状态\n" +
                "任务处理人\n" +
                "所属应用\n" +
                "应用版本\n" +
                "创建人\n" +
                "任务创建日期\n" +
                "模块名称\n" +
                "修改版本\n" +
                "补丁编号\n" +
                "迭代名称\n" +
                "任务设计人\n" +
                "任务描述\n" +
                "测试建议\n" +
                "预计开发完成日期\n" +
                "实际开发完成日期\n" +
                "需求编号\n" +
                "测试分配人\n" +
                "测试安排状态\n" +
                "测试类型\n" +
                "用例编写人\n" +
                "用例完成状态\n" +
                "要求用例完成日期\n" +
                "实际用例完成日期\n" +
                "测试执行人\n" +
                "要求测试完成日期\n" +
                "实际测试完成日期\n" +
                "预估测试工时\n" +
                "实际测试工时\n" +
                "用例评审负责人\n" +
                "用例是否评审\n" +
                "用例评审结论\n" +
                "用例评审标志";
        String 开发单配置 = "任务编号\n" +
                "任务名称\n" +
                "客户名称\n" +
                "任务状态\n" +
                "任务描述\n" +
                "任务来源\n" +
                "创建人\n" +
                "任务处理人\n" +
                "所属应用\n" +
                "应用版本\n" +
                "模块名称\n" +
                "修改版本\n" +
                "项目名称\n" +
                "测试包版本号\n" +
                "集成日期\n" +
                "末次集成日期\n" +
                "补丁编号\n" +
                "测试建议\n" +
                "修改说明\n" +
                "修改文件\n" +
                "需求编号\n" +
                "需求类型\n" +
                "需求描述\n" +
                "测试执行人\n" +
                "测试分配人\n" +
                "测试类型\n" +
                "测试结果\n" +
                "测试打回次数\n" +
                "测试不通过次数\n" +
                "要求测试完成日期\n" +
                "实际测试完成日期\n" +
                "预估测试工时\n" +
                "实际测试工时\n" +
                "用例评审负责人\n" +
                "缺陷编号";
        String[] 任务单配置数组 = 任务单配置.split("\n");
        String[] 开发单配置数组 = 开发单配置.split("\n");
        List<String> 任务单配置列表 = Arrays.asList(任务单配置数组);
        List<String> 开发单配置列表 = Arrays.asList(开发单配置数组);
        List<String> 开发单需补充配置列表 = new ArrayList<>();
        任务单配置列表.forEach((x) -> {
            if(!开发单配置列表.contains(x)) {
                开发单需补充配置列表.add(x);
            }
        });
        System.out.println(开发单配置列表);
        System.out.println(开发单需补充配置列表);
        System.out.println(任务单配置列表);
    }

    @Test
    void testTaskToModify() {
        String a = "{\"a\":\"\"}";
        String b = "{\"b\":[]}";
        String c = "{\"tdrender\":[null,null]}";
        String d = "{\"d\":null}";
        String e = "{\"e\":1}";
        JSONObject jsonObject = JSONObject.parseObject(a);
        Object a1 = jsonObject.get("a");
        Object b1 = jsonObject.get("b");
        JSONArray b2 = jsonObject.getJSONArray("b");
        Object c1 = jsonObject.get("tdrender");
        Object c2 = jsonObject.getJSONArray("tdrender");
        Object d1 = jsonObject.get("d");
        Object e1 = jsonObject.get("e");
        System.out.println(jsonObject);
    }
}
