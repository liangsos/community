package life.majiang.community.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chen Hualiang
 * @date 2019/9/3 - 9:52
 */
@Data
public class PaginationDTO {
    private List<QuestionDTO> questions;
    private boolean showPrevious;  //上一页
    private boolean showFirstPage; //第一页
    private boolean showNext;      //下一页
    private boolean showEndPage;   //最后一页
    private Integer page;
    private List<Integer> pages = new ArrayList<>();  //页码列表，展示当前page数
    private Integer totalPage;     //最大页码


    public void setPagination(Integer totalCount, Integer page, Integer size) {
        //获取最大页码
        if (totalCount % size == 0) {
            totalPage = totalCount / size;
        } else {
            totalPage = totalCount / size + 1;
        }
        //获取页码列表 最多展示7个页码，在本页向前展示3个页码向后展示3个页码
        this.page = page;
        pages.add(page);
        for (int i = 1; i <= 3; i++) {
            if (page - i > 0) {
                pages.add(0, page - i);
            }
            if (page + i <= totalPage) {
                pages.add(page + i);
            }
        }
        //是否展示上一页
        if (page == 1) {
            showPrevious = false;
        } else {
            showPrevious = true;
        }
        //是否展示下一页
        if (page == totalPage) {
            showNext = false;
        } else {
            showNext = true;
        }
        //是否展示第一页
        if (pages.contains(1)) {
            showFirstPage = false;
        } else {
            showFirstPage = true;
        }
        //是否展示最后一页
        if (pages.contains(totalPage)) {
            showEndPage = false;
        } else {
            showEndPage = true;
        }


    }
}
