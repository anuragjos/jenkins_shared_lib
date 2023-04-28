def call(Map stageParams){
    chechkout([
        $class: 'GitSCM',
        branches: [[name: stageParams.branch]],
        userRemoteConfigs: [[ url: stageParams.url ]]
    ])
}