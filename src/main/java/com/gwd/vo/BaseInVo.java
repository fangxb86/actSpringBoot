package com.gwd.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class BaseInVo  implements Serializable {

    @ApiModelProperty(value = "分页参数", name = "pageVo")
    private PageVo pageVo;

    private int code = 200;

    private String msg;
}
