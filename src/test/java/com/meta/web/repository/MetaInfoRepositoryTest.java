package com.meta.web.repository;

import com.meta.web.domain.MetaInfoEntity;
import com.meta.web.repo.MetaInfoRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MetaInfoRepositoryTest {

    @Autowired
    private MetaInfoRepository metaInfoRepository;

    @Test
    public void saveMetas() {
        metaInfoRepository.save(new MetaInfoEntity("FLASH", true, "BARRY", "ALLEN"));
        List<MetaInfoEntity> metas = metaInfoRepository.findAll();
        Assert.assertNotNull(metas);
        metas.forEach(System.out::println);
    }
}
