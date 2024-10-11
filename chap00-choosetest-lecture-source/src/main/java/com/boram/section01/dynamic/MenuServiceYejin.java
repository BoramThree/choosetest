package com.boram.section01.dynamic;

import com.boram.common.MenuDTOYejin;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.IllegalFormatCodePointException;
import java.util.List;

import static com.boram.common.Template.getSqlSession;

public class MenuServiceYejin {

    private DynamicSqlMapperYejin mapperYejin;

    public void selectOrderable(String input) {
        SqlSession sqlSession = getSqlSession();

        mapperYejin = sqlSession.getMapper(DynamicSqlMapperYejin.class);

        List<MenuDTOYejin> menuList = mapperYejin.selectOrderable(input);

        if (menuList != null && menuList.size() > 0){
            for (MenuDTOYejin menu : menuList){
                System.out.println(menu);
            }
        } else {
            System.out.println("출력할 결과가 없습니다.");
        }
    }

    public void selectOrderableChoose(String input) {
        SqlSession sqlSession = getSqlSession();

        mapperYejin = sqlSession.getMapper(DynamicSqlMapperYejin.class);

        List<MenuDTOYejin> menuList = mapperYejin.selectOrderableChoose(input);

        if (menuList != null && menuList.size() > 0){
            for (MenuDTOYejin menu : menuList){
                System.out.println(menu);
            }
        } else {
            System.out.println("출력할 결과가 없습니다.");
        }
        //
    }
}
