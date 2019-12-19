package com.mix.midful.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * 商家信息表
 * @author guobin
 */
@Document(collation = "seller_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SellerInfo {

    @Id
    private String sellerId;

    private String username;

    private String password;

    private String openid;
}
