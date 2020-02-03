// package com.mf.mybatisdemo.controller;
//
// import com.mf.mybatisdemo.bean.Employee;
// import com.mf.mybatisdemo.service.EmpService;
// import com.mf.mybatisdemo.utils.DateUtil;
// import com.mf.mybatisdemo.vo.EmpVO;
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.multipart.MultipartFile;
// import org.springframework.web.servlet.ModelAndView;
// import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
// import java.io.IOException;
// import java.nio.file.Files;
// import java.nio.file.Path;
// import java.nio.file.Paths;
// import java.util.List;
// import java.util.Objects;
// import java.util.UUID;
//
// /**
//  * @author Maven
//  * @date 2018/9/29
//  * Description:
//  */
// @Controller
// @RequestMapping("/emp")
// public class EmpController {
//     private static final Logger LOGGER = LoggerFactory.getLogger(EmpController.class);
//     private final EmpService empService;
//     private static final String UP_LOAD_FODER = "/Users/apple/IdeaProjects/meifans" +
//             "/springboot-mybatis-demo/src/resource/static" +
//             "/emp/";
//
//
//     @Autowired
//     public EmpController(EmpService empService) {
//         this.empService = empService;
//     }
//
//     @RequestMapping("/list")
//     public ModelAndView toEmpListPage() {
//         ModelAndView modelAndView = new ModelAndView();
//         List<EmpVO> allEmps = empService.getAllEmps();
//         modelAndView.setViewName("/pages/emp/emp_list");
//         modelAndView.addObject("emps", allEmps);
//         return modelAndView;
//     }
//
//     /**
//      * 添加emp
//      *
//      * @param employee
//      * @param birthDay
//      * @param multipartFile
//      * @param redirectAttributes
//      * @return
//      */
//     // @RequestMapping(value = "/add", method = RequestMethod.POST)
//     // public String addEmp(Employee employee
//     //         , @RequestParam("birthDay") String birthDay
//     //         , @RequestParam("imageFile") MultipartFile multipartFile
//     //         , RedirectAttributes redirectAttributes) {
//     //     Path newPath = null;
//     //     if (multipartFile == null) {
//     //         throw new RuntimeException("文件错误");
//     //     }
//     //     try {
//     //         byte[] bytes = multipartFile.getBytes();
//     //         String originalFilename = multipartFile.getOriginalFilename();
//     //         String path = UUID.randomUUID().toString().substring(0, 5) +
//     //                 originalFilename.substring(originalFilename.lastIndexOf("."));
//     //         newPath = Paths.get(UP_LOAD_FODER + path);
//     //         Files.write(newPath, bytes);
//     //     } catch (IOException e) {
//     //         LOGGER.error("上传文件失败了。。。");
//     //     }
//     //     if (!Objects.isNull(newPath)) {
//     //         String pathName = newPath.toString();
//     //         employee.setImage(pathName);
//     //     }
//     //     employee.setBirth(DateUtil.toDateWith_YYYYMMDD(birthDay));
//     //     empService.addEmp(employee);
//     //     return "redirect:/emp/list";
//     // }
//
//     @RequestMapping("/get/{id}")
//     public ModelAndView modifyEmp(@PathVariable("id") Integer id) {
//
//         EmpVO empVO = empService.findEmpVOById(id);
//         ModelAndView modelAndView = new ModelAndView();
//         modelAndView.addObject("empVO", empVO);
//         modelAndView.setViewName("pages/emp/emp_update");
//         return modelAndView;
//     }
//
// }
