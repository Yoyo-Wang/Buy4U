/*
 * Created by Hang Hu on 2016.12.07  * 
 * Copyright © 2016 Hang Hu. All rights reserved. * 
 */
package com.company.cdibeans;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
/**
 *
 * @author Theodore
 */
public class ContentFlow {

    private List<String> images;

    @PostConstruct
    public void init() {
        images = new ArrayList<String>();
        images.add("Movie.jpg");
        images.add("Food.jpg");
        images.add("Book.jpg");
        images.add("Electronics.jpg");
//        for (int i = 1; i <= 12; i++) {
//            images.add("nature" + i + ".jpg");
//        }
    }

    public List<String> getImages() {
        return images;
    }
}
