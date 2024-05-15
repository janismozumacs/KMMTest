// swift-tools-version:5.3
import PackageDescription

// BEGIN KMMBRIDGE VARIABLES BLOCK (do not edit)
let remoteKotlinUrl = "https://maven.pkg.github.com/janismozumacs/KMMTest/come/test/kmm/allshared-kmmbridge/1.0.1/allshared-kmmbridge-1.0.1.zip"
let remoteKotlinChecksum = "76d30cf11260f7d132691b783c75453c03874af10cd1cc60d327a4b2e596e138"
let packageName = "allshared"
// END KMMBRIDGE BLOCK

let package = Package(
    name: packageName,
    platforms: [
        .iOS(.v13)
    ],
    products: [
        .library(
            name: packageName,
            targets: [packageName]
        ),
    ],
    targets: [
        .binaryTarget(
            name: packageName,
            url: remoteKotlinUrl,
            checksum: remoteKotlinChecksum
        )
        ,
    ]
)