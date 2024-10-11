package com.boram.section01.dynamic;

import com.boram.common.MenuDTOMoon;
import com.boram.common.SearchCriteriaMoon;
import org.apache.ibatis.session.SqlSession;

import java.util.Collections;
import java.util.List;

import static com.boram.common.Template.getSqlSession;

public class MenuServiceMoon {

    private DynamicSqlMapperMoon mapper;

    public void selectMenuByName(String menuName) {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(DynamicSqlMapperMoon.class);

        List<MenuDTOMoon> menuList = mapper.selectMenuByName(Collections.singletonList(menuName));

        for (MenuDTOMoon menu : menuList) {
            System.out.println(menu.toString());
        }

        sqlSession.close();

    }

    public static void searchMenuBySupCategory(SearchCriteriaMoon searchCriteriaMoon) {
        SqlSession sqlSession = getSqlSession();
        DynamicSqlMapperMoon mapper = sqlSession.getMapper(DynamicSqlMapperMoon.class);

        // 검색된 메뉴 리스트 가져오기
        List<MenuDTOMoon> menuList = mapper.selectMenuByName(searchCriteriaMoon.getNameList());

        // 검색된 결과 출력
        for (MenuDTOMoon menu : menuList) {
            System.out.println(menu.toString());
        }

        sqlSession.close();  // SQL 세션 종료
    }
}
