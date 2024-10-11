package com.boram.section01.dynamic;

import com.boram.common.HjCategoryDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.boram.common.Template.getSqlSession;

public class HjService {

    private static HjDynamicSqlMapper mapper;

    public static void selectCategory(int inputNo) {
        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(HjDynamicSqlMapper.class);

        Map<String, Integer> map = new HashMap<>();
        map.put("inputNo", inputNo);

        List<HjCategoryDTO> categoryList = mapper.selectCategory(map);

        if(categoryList != null && categoryList.size() > 0) {
            for (HjCategoryDTO category : categoryList) {
                System.out.println(category);
            }
        } else {
            System.out.println("검색 결과가 없습니다.");
        }

        sqlSession.close();

    }

}
