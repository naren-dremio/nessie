/*
 * Copyright (C) 2020 Dremio
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dremio.nessie.hms;

import java.util.stream.Stream;

import org.apache.hadoop.hive.metastore.api.SQLCheckConstraint;
import org.apache.hadoop.hive.metastore.api.SQLDefaultConstraint;
import org.apache.hadoop.hive.metastore.api.SQLNotNullConstraint;
import org.apache.hadoop.hive.metastore.api.SQLUniqueConstraint;

public abstract class BaseRawStore3 extends BaseRawStore {

  protected BaseRawStore3(boolean hasDelegate) {
    super(hasDelegate);
  }

  protected static Stream<String> route(SQLCheckConstraint c) {
    return Stream.of(c.getTable_db());
  }

  protected static Stream<String> route(SQLNotNullConstraint c) {
    return Stream.of(c.getTable_db());
  }

  protected static Stream<String> route(SQLUniqueConstraint c) {
    return Stream.of(c.getTable_db());
  }

  protected static Stream<String> route(SQLDefaultConstraint c) {
    return Stream.of(c.getTable_db());
  }
}
