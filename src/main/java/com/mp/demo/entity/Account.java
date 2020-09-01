
package com.mp.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
	
	@ApiModelProperty(notes = "Account Id",name = "accId",required = false)
	@Id
	@GeneratedValue
	private int accId;
	@ApiModelProperty(notes = "Customer Id",name = "custId",required = true)
	private int custId;
	private int accBalance;
}
