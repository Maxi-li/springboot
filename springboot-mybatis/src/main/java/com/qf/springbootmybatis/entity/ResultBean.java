/**
 * FileName: ResultBean
 * Author:   Max
 * Description:
 */
package com.qf.springbootmybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultBean<T> {

    private String respCode;

    private T data;

}

