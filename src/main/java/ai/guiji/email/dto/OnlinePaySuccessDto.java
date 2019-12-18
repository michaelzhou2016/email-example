package ai.guiji.email.dto;

import lombok.Data;

/**
 * author: zhouliliang
 * Date: 2019/12/18 11:42
 * Description:
 */
@Data
public class OnlinePaySuccessDto {

    private String customer;

    private String operator;

    private String payType;

    private String amount;

    private String date;
}
