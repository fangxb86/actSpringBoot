package com.gwd.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class PageVo implements Serializable {

   @ApiModelProperty(value = "页码", name = "pageNo")
   private Integer pageNo;

   @ApiModelProperty(value = "每页记录数", name = "pageSize")
   private Integer pageSize;

   @ApiModelProperty(value = "记录总数", name = "total")
   private Integer total;

   @ApiModelProperty(value = "记录总页数", name = "pageTotal")
   private Integer pageTotal;


}
