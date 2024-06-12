import { createApp } from 'vue';
import App from './App.vue';
import router from './router';
import store from './store';  // 确保路径正确
import './styles/main.css'; // 引入全局样式

const app = createApp(App);

app.use(router);
app.use(store);

app.mount('#app');
