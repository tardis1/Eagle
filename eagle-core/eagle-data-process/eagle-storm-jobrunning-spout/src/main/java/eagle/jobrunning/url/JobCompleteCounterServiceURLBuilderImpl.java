/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package eagle.jobrunning.url;

import eagle.jobrunning.common.JobConstants;

public class JobCompleteCounterServiceURLBuilderImpl implements ServiceURLBuilder {
		
	public String build(String ... parameters) {
		// parameters[0] = historyBaseUrl, parameters[1] = jobID		
		// {historyUrl}/jobhistory/jobcounters/job_xxxxxxxxxxxxx_xxxxx?anonymous=true
		return parameters[0] + "jobhistory/jobcounters/" + parameters[1] 
							 + "?" + JobConstants.ANONYMOUS_PARAMETER;
	}
}