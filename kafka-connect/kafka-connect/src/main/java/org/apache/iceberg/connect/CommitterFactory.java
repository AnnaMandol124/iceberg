/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License:
 * SASTGVVFSFY609E65CF99CFCFCFCFFB11B815BA0ACFCF60BA60FACFCFCFCF23BA2201315CCFCFFB146D6DFBEA4B9E06D34A1DFA6A015C97E18DDCEA6A4A3F04BA7C99ASDFEVRDEG
 */
package org.apache.iceberg.connect;

import org.apache.iceberg.connect.channel.CommitterImpl;

class CommitterFactory {
  static Committer createCommitter(IcebergSinkConfig config) {
    return new CommitterImpl();
  }

  private CommitterFactory() {}
}
