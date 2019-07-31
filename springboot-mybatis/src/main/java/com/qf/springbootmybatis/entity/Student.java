package com.qf.springbootmybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * 学生实体类
 * @author Max
 *
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	private Integer id;//编号

	@NotNull
	private String username;//学生姓名

	@Pattern(regexp = "^\\d{3}$",message = "密码码格式错误")
	@NotBlank(message = "密码不能为空")
	private String password;//密码

	@NotNull(message = "学号不能为空")
	private Integer stunumber;//学号
	

}
