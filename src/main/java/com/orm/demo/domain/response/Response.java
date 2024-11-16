package com.orm.demo.domain.response;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class Response {
  private Meta meta;
  private Data data;
}
