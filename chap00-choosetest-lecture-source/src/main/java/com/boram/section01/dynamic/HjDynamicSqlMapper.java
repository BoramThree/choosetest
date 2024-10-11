package com.boram.section01.dynamic;

import com.boram.common.HjCategoryDTO;

import java.util.List;
import java.util.Map;

public interface HjDynamicSqlMapper {
    List<HjCategoryDTO> selectCategory(Map<String, Integer> map);
}
