package com.boram.section01.dynamic;

import com.boram.common.MenuDTOYejin;

import java.util.List;

public interface DynamicSqlMapperYejin {
    List<MenuDTOYejin> selectOrderable(String input);
}
