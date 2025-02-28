package com.example.demo.entity;

import java.util.Date;

import lombok.Data;

/**
 * ユーザー情報 Entity
 */
@Data
public class UserInfo {
	
	/**
	 * ID
	 */
	private Long id;

	/**
	 * 名前
	 */
	private String name;
	
	/**
	 * 住所
	 */
	private String address;
	
	/**
	 * 電話番号
	 */
	private String phone;
	
	/**
	 * 更新日時
	 */
	private Date updateDate;
	
	/**
	 * 登録日時
	 */
	private Date createDate;
	
	/**
	 * 削除日時
	 */
	private Date deleteDate;
	
	/**
	 * 部署ID
	 */
	private int departmentId;
	
	/**
	 * 部署名
	 */
	private String departmentName;
	
	/**
	 * 昇順降順値
	 */
	private String sortOrder;
}
