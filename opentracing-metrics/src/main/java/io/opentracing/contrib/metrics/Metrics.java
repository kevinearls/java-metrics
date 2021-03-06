/**
 * Copyright 2017 The OpenTracing Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package io.opentracing.contrib.metrics;

import io.opentracing.Tracer;
import io.opentracing.contrib.metrics.internal.tracer.MetricsTracer;

/**
 * This is the main entry point into the metrics capability, enabling a {@link Tracer}
 * instance to be decorated with the metrics reporting functionality.
 *
 */
public class Metrics {

    /**
     * This method decorates a supplied tracer with the ability to report span
     * based metrics to the supplied metrics reporter.
     *
     * @param tracer The tracer
     * @param reporter The reporter
     * @return The decorated tracer
     */
    public static Tracer decorate(Tracer tracer, MetricsReporter reporter) {
        return new MetricsTracer(tracer, reporter);
    }
}
