package com.zyn.java.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * @author zhangyanan
 * @description
 * @date 2017/10/30 0030 21:30
 */
@Getter
@Setter
@ToString
public class User {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "主键（不需要填）")
    private Long    id;
    @ApiModelProperty("账号")
    private String username;
    @ApiModelProperty("密码")
    private String  password;
    @ApiModelProperty("昵称")
    private String  nickName;
    @ApiModelProperty("邮箱")
    private String  email;
    @ApiModelProperty("性别")
    private Boolean gender;
    @ApiModelProperty("年龄")
    private Integer age;
    @ApiModelProperty("身份证号")
    private String  idCard;
    @ApiModelProperty(value = "创建时间（不需要填）", hidden = true)
    private Timestamp createTime;
    @ApiModelProperty(value = "更新时间（不需要填）", hidden = true)
    private Timestamp    updateTime;
}
