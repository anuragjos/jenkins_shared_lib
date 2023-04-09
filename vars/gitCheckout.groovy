/* groovylint-disable-next-line NoDef */
/* groovylint-disable-next-line MethodReturnTypeRequired, NoDef */
def call(Map stageParams) {
    checkout {[
        $class: 'GitSCM',
        branches: [[ name: stageParams.branch ]],
        userRemoteConfigs: [[ url: stageParams.url ]]
    ]}
}