package com.example.demo.dto;

import java.io.Serializable;

import lombok.Data;

/**
 * ユーザー情報 検索用リクエストデータ
 */
@Data
public class UserSearchRequest implements Serializable {
	
	/**
	 * ユーザーID
	 */
	private String id;
	
	/**
	 * ユーザー名
	 */
	private String name;

	/**
	 * 部署ID
	 */
	private Integer departmentId;
	
	/**
	 * 部署名
	 */
	private String departmentName;
	
	/**
	 * 昇順降順値
	 */
	private String sortOrder;
}
