package ai.guiji.email.constant;

/**
 * author: zhouliliang
 * Date: 2019/12/17 11:52
 * Description:
 */
public enum EmailTypeEnum {
    ONLINE_PAY_SUCCESS(0),
    OFFLINE_PAY_APPLY(1);

    private int type;

    EmailTypeEnum(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
