package com.orm.demo.domain.response.couch;

import java.util.List;

import com.orm.demo.domain.models.Couch;
import com.orm.demo.domain.response.Meta;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CouchResponse {
  Meta meta;
  List<Couch> data;
}
