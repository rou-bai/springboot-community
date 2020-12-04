package life.majiang.community.community.controller;

import life.majiang.community.community.dto.NotificationDTO;
import life.majiang.community.community.dto.PaginationDTO;
import life.majiang.community.community.enmus.NotificationTypeEnum;
import life.majiang.community.community.model.User;
import life.majiang.community.community.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class NotificationController {
    @Autowired
    private NotificationService notificationService;

    @GetMapping("/notification/{id}")
    public String profile(@PathVariable(name = "id") Long id,
                          Model model,
                          HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            return "redirect:/";
        }

//        //标记通知状态为已读
//        notificationService.updateStatus(id);

        NotificationDTO notificationDTO = notificationService.read(id, user);
        if (notificationDTO.getType() == NotificationTypeEnum.REPLY_QUESTION.getType() || notificationDTO.getType() == NotificationTypeEnum.REPLY_COMMENT.getType()) {
            return "redirect:/question/" + notificationDTO.getQuestionid();
        } else {
            return "redirect:/";
        }
    }
}