/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package com.dangdang.ddframe.job.lite.integrate.std.simple;

import com.dangdang.ddframe.job.api.type.dataflow.api.DataflowJobConfiguration;
import com.google.common.base.Optional;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.dangdang.ddframe.job.lite.integrate.AbstractBaseStdJobTest;
import com.dangdang.ddframe.job.lite.integrate.fixture.simple.FooSimpleElasticJob;

public final class DisabledJobTest extends AbstractBaseStdJobTest {
    
    public DisabledJobTest() {
        super(FooSimpleElasticJob.class, true, Optional.<DataflowJobConfiguration.DataflowType>absent());
    }
    
    @Before
    @After
    public void reset() {
        FooSimpleElasticJob.reset();
    }
    
    @Test
    public void assertJobInit() {
        initJob();
        assertRegCenterCommonInfoWithDisabled();
    }
}