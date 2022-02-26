import mill._, scalalib._

object CLI extends JavaModule {
    def scalaVersion = "2.12.7"

    def ivyDeps = Agg(
        ivy"org.apache.xbean:xbean-asm6-shaded:4.10",
        ivy"org.apache.spark:spark-core_2.11:2.4.1"
    )
}
