import './plugins/axios'
import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import ElementPlus from 'element-plus';

const app = createApp(App);
app.use(ElementPlus);
createApp(App).use(router).mount('#app')
