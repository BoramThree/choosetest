package com.boram.section01.dynamic;

import com.boram.common.MenuDTO;
import com.boram.common.MenuDTOMoon;

import java.util.List;

public interface DynamicSqlMapperMoon {
    List<MenuDTOMoon> selectMenuByName(List<String> nameList);
}
