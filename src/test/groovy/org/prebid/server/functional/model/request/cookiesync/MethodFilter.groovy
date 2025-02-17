package org.prebid.server.functional.model.request.cookiesync

import groovy.transform.ToString
import org.prebid.server.functional.model.bidder.BidderName

@ToString(includeNames = true, ignoreNulls = true)
class MethodFilter {

    List<BidderName> bidders
    FilterType filter
}
