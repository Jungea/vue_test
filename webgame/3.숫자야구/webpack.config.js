const path = require('path');

module.exports = {
    entry: {
        app: path.join(__dirname, 'main.js'),
        //app은 하나로 합쳐질 이름 (app.js == [name].js)
    },
    module: {
        rules: [{

        }]
    },
    plugins: [],
    output: {
        filename: '[name].js',
        path: path.join(__dirname, 'dist'),
    },
}
// 노드에 모듈을 생성
// 웹팩을 사용하는 이유는? 스크립트들이 너무 많아지면 그것을 합치기위해서 있는 것.
// 기본 entry, module, plugins, output