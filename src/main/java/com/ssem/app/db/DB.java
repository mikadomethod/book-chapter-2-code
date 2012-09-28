package com.ssem.app.db;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface DB {

	List<String> load(String key);

	void store(Map<String, Serializable> data);

}