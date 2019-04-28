package com.funtl.spring.boot.alipay.service.impl;

import com.funtl.spring.boot.alipay.domain.Flow;
import com.funtl.spring.boot.alipay.mapper.FlowMapper;
import com.funtl.spring.boot.alipay.service.FlowService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FlowServiceImpl extends BaseServiceImpl<Flow,FlowMapper> implements FlowService<Flow> {
}
