/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.iotdb.admin.model.vo;

import lombok.Data;

/** 返回信息类 */
@Data
public class BaseVO<T> {

  /** 0 表示成功 其他表示错误类型 */
  private String code;

  /** 定义出错时候用户可读的信息 */
  private String message;

  /** 这是一个返回数据的通用类型模板 */
  private T data;

  public BaseVO() {}

  public BaseVO(String code, String message, T data) {
    this.code = code;
    this.message = message;
    this.data = data;
  }

  public static <T> BaseVO<T> success(String message, T data) {
    return new BaseVO<>("0", message, data);
  }
}
