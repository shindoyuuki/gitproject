package com.example.webapp.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * 【メモ】
 * Mapper操作のため、Entityアノテーションは必要ない
 * (JDBC:ポスグレ）
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ToDo {
	
	/*
	 * することID
	 */
	private Integer id;
	
	/*
	 * すること
	 */
	private String todo;
	
	/*
	 * すること詳細
	 */
	private String detail;
	
	/*
	 * 作成日付
	 * LocalDateTime型「日付（年月日） と 時刻（時分秒） を組み合わせた情報を扱う」
	 */
	private LocalDateTime createdAt;
	
	/*
	 * 更新日付
	 */
	private LocalDateTime updatedAt;

}

/** 
 * @NoArgsConstructor
 * 引数なしの デフォルトコンストラクタ が自動生成されます。
 * public ToDo() {
 * }
 * 
 * @AllArgsConstructor
 * すべてのフィールドを引数とするコンストラクタを自動的に生成します。
 * public ToDo(Integer id, String todo, String detail, LocalDateTime createdAt, LocalDateTime updatedAt) {
 *     this.id = id;
 *     this.todo = todo;
 *     this.detail = detail;
 *     this.createdAt = createdAt;
 *     this.updatedAt = updatedAt;
 * }
 * 
 * @Data
 * ゲッターとセッターが自動生成される。
 * public Integer getId() {
 *     return id;
 * }
 * public void setId(Integer id) {
 *     this.id = id;
 * }
 */