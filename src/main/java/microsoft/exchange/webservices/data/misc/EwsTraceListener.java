/*
 * The MIT License
 * Copyright (c) 2012 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package microsoft.exchange.webservices.data.misc;

import microsoft.exchange.webservices.data.interfaces.ITraceListener;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * EwsTraceListener logs request/response.
 */
public class EwsTraceListener implements ITraceListener {

  private final Log log = LogFactory.getLog(EwsTraceListener.class);


  public EwsTraceListener() {
  }

  /**
   * Handles a trace message.
   *
   * @param traceType    The trace type
   * @param traceMessage The trace message
   */
  @Override
  public void trace(String traceType, String traceMessage) {
    if(log.isTraceEnabled()) {
      log.trace(traceType + " - " + traceMessage);
    }
  }
}