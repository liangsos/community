package life.majiang.community.enums;

/**
 * @author Chen Hualiang
 * @date 2019/9/29 - 8:50
 */
public enum NotificationStatusEnum {
    UNREAD(0),
    READ(1)
    ;
    private int status;

    public int getStatus() {
        return status;
    }

    NotificationStatusEnum(int status) {
        this.status = status;
    }
}
