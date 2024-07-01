package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserInfoMapper;
import com.example.demo.dto.UserAddRequest;
import com.example.demo.dto.UserSearchRequest;
import com.example.demo.dto.UserUpdateRequest;
import com.example.demo.entity.UserInfo;

/**
 * ユーザー情報 Service
 */
@Service
public class UserInfoService {
	
	/**
	 * ユーザー情報 Mapper
	 */
	@Autowired
	private UserInfoMapper userInfoMapper;
	
	/**
	 * ユーザー情報全件検索
	 * @return 検索結果
	 */
	public List<UserInfo> findAll() {
		return userInfoMapper.findAll();
	}

	/**
	 * 削除済みユーザー情報全件検索
	 * @return 検索結果
	 */
	public List<UserInfo> deleteListAll() {
		return userInfoMapper.deleteListAll();
	}
	
	/**
	 * ユーザー情報主キー検索
	 * @return 検索結果
	 */
	public UserInfo findById(Long id) {
		return userInfoMapper.findById(id);
	}
	
	/**
	 * ユーザー情報検索
	 * @param userSearchRequest リクエストデータ
	 * @return 検索結果
	 */
	public List<UserInfo> search(UserSearchRequest userSearchRequest) {
		return userInfoMapper.search(userSearchRequest);
	}
	
	/**
	 * 削除済みユーザー情報検索
	 * @param userSearchRequest リクエストデータ
	 * @return 検索結果
	 */
	public List<UserInfo> deleteListSearch(UserSearchRequest userSearchRequest) {
		return userInfoMapper.deleteListSearch(userSearchRequest);
	}
	
	/**
	 * ユーザー情報登録
	 * @param userAddRequest リクエストデータ
	 */
	public void save(UserAddRequest userAddRequest) {
		userInfoMapper.save(userAddRequest);
	}
	
	/**
	 * ユーザー情報更新
	 * @param userEditRequest リクエストデータ
	 */
	public void update(UserUpdateRequest userUpdateRequest) {
		userInfoMapper.update(userUpdateRequest);
	}
	
	/**
	 * ユーザー情報論理削除
	 * @param id ユーザーID
	 */
	public void softDelete(Long id) {
		userInfoMapper.softDelete(id);
	}
	
	/**
	 * ユーザー情報物理削除
	 * @param id ユーザーID
	 */
	public void delete(Long id) {
		userInfoMapper.delete(id);
	}
	
	
	/**
	 * ユーザー情報復元
	 * @param id ユーザーID
	 */
	public void restoration(Long id) {
		userInfoMapper.restoration(id);
	}
}
