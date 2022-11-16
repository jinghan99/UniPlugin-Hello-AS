<template>
	<view class="uni-container">
		<view class="uni-hello-text">
			<text class="hello-text">uni原生插件示例</text>
			<button class="hello-text" @click="hello()">hello_uniplugin</button>
		</view>

	</view>
</template>
<script>
	const hello_uniplugin = uni.requireNativePlugin('HelloPlugin')
	export default {
		data() {
			return {
				navigateFlag: false,
				resp: ""
			}
		},
		onLoad() {},
		methods: {
			hello() {
				let req = {
					navigateFlag: false,
				}
				let data = hello_uniplugin.sync(req);
				this.resp = data;
			}
		}
	}
</script>

<style>
</style>
