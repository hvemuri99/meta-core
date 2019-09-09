package com.meta.web.controller;

import com.meta.web.dto.MetaCoreRequest;
import com.meta.web.dto.MetaCoreResponse;
import com.meta.web.dto.MetaCoreStatus;
import com.meta.web.dto.MetaRecord;
import com.meta.web.exception.MetaCoreApiException;
import com.meta.web.security.AppBasicAuthFilter;
import com.meta.web.util.DateUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @Author hvemuri
 * @Generated at 5/14/2018 10:18 AM
 */
@RestController
@RequestMapping("/metas")
public class MetaCoreController {

    private static final Logger LOGGER = Logger.getLogger(MetaCoreController.class);

    @Autowired
    private AppBasicAuthFilter appBasicAuthFilter;

    @RequestMapping("/getVersion")
    @ResponseBody
    public Map<String, Object> getVersion() {
        LOGGER.info("/getVersion is requested.");
        Map<String, Object> kvPair = new LinkedHashMap<String, Object>();
        kvPair.put("status", "ok");
        kvPair.put("responseTime", DateUtil.utcFormat(new Date()));
        return kvPair;
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @RequestMapping(value = {"/fetch/{version}"}, method = {RequestMethod.POST})
    @ResponseBody
    public MetaCoreResponse getMetaBySuperStrength(@RequestBody MetaCoreRequest metaCoreRequest,
                                                   @RequestHeader HttpHeaders httpHeaders, @PathVariable String version) {
        List<String> basicAuthentication = httpHeaders.get("Authorization");
        if (basicAuthentication == null || basicAuthentication.isEmpty()) {
            throw new MetaCoreApiException("01", "BasicAuthFailed");
        }
        appBasicAuthFilter.validateBasicAuth(basicAuthentication.get(0));
        MetaCoreResponse metaCoreResponse = new MetaCoreResponse();
        MetaCoreStatus metaCoreStatus = new MetaCoreStatus();
        metaCoreStatus.setCode("200");
        metaCoreStatus.setMessage("ok");
        List<MetaRecord> metas = new ArrayList<>();
        MetaRecord meta = new MetaRecord();
        meta.setMetaName("FLASH");
        meta.setAbout("nefnkjsndcnan,msnjsndmcjkshfjnsnscmnbsdfh............");
        metas.add(meta);
        metaCoreResponse.setMetas(metas);
        metaCoreResponse.setMetaCoreStatus(metaCoreStatus);
        return metaCoreResponse;
    }

}
