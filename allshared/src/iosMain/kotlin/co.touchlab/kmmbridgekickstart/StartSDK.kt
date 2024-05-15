package co.touchlab.kmmbridgekickstart

fun startSDK(analytics: Analytics): SDKHandle {
    val analyticsHandle = initAnalytics(analytics)
    return SDKHandle(
        breedRepository = CallbackBreedRepository(breedRepository = breedStartup(analyticsHandle)),
        appAnalytics = analyticsHandle.appAnalytics,
        breedAnalytics = analyticsHandle.breedAnalytics
    )
}

fun getElectricityObject(): Pair<String, Double> {
    return ("Rēzeknes iela", 45.6)
}
