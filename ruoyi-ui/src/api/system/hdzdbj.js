import request from '@/utils/request'

// 查询活动终端标记列表
export function listHdzdbj(query) {
  return request({
    url: '/system/hdzdbj/list',
    method: 'get',
    params: query
  })
}

// 查询活动终端标记详细
export function getHdzdbj(id) {
  return request({
    url: '/system/hdzdbj/' + id,
    method: 'get'
  })
}

// 新增活动终端标记
export function addHdzdbj(data) {
  return request({
    url: '/system/hdzdbj',
    method: 'post',
    data: data
  })
}

// 修改活动终端标记
export function updateHdzdbj(data) {
  return request({
    url: '/system/hdzdbj',
    method: 'put',
    data: data
  })
}

// 删除活动终端标记
export function delHdzdbj(id) {
  return request({
    url: '/system/hdzdbj/' + id,
    method: 'delete'
  })
}


// 商户服务费代收
export function chargeCollect(data) {
  return request({
    url: '/system/hdzdbj/serviceChargeCollect',
    method: 'post',
    data: data
  })
}
