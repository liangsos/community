package life.majiang.community.dto;

import lombok.Data;

/**
 * @author Chen Hualiang
 * @date 2019/9/29 - 9:32
 */
@Data
public class NotificationDTO {
    private Long id;
    private Long gmtCreate;
    private Integer status;
    private Long notifier;
    private String notifierName;
    private String outerTitle;
    private String type;
}
