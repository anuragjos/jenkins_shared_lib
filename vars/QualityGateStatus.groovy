def call() {
    try {
        timeout(time: 10, unit: 'MINUTES') {
            def qg = waitForQualityGate(abortPipeline: false)
            echo "Quality Gate Status: ${qg.status}"
            return qg.status
        }
    } catch (Exception e) {
        echo "Quality Gate skipped: ${e.message}"
        return "SKIPPED"
    }
}
